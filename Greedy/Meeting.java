import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Meeting {
	
	private int startTime;
	private int endTime;
	
	public Meeting(int startTime, int endTime){
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getStartTime(){
		return startTime;
	}
	public void setStartTime(int startTime){
		this.startTime = startTime;
	}
	public int getEndTime(){
		return endTime;
	}
	public void setEndTime(int endTime){
		this.endTime = endTime;
	}
	
	public static List<Meeting> mergeRanges(List<Meeting> meetings) {
		List<Meeting> sortedMeeting = new ArrayList<>();
		
		for(Meeting meeting : meetings) {
			Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
			sortedMeeting.add(meetingCopy);
		}
		
		Collections.sort(sortedMeeting, new Comparator<Meeting>(){
			public int compare(Meeting m1, Meeting m2) {
				return m1.getStartTime() - m2.getStartTime();
			}
		});
		
		List<Meeting> mergedMeetings = new ArrayList<>();
		mergedMeetings.add(sortedMeeting.get(0));
		
		for(Meeting currentMeeting : sortedMeeting){
			Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);
			
			if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
				lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
			} else {
				mergedMeetings.add(currentMeeting);
			}
		}
		return mergedMeetings;
	}
	
	   @Test
	    public void meetingsOverlapTest() {
	        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList(new Meeting(1, 4));
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void  meetingsTouchTest() {
	        final List<Meeting> meetings = Arrays.asList(new Meeting(5, 6), new Meeting(6, 8));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList(new Meeting(5, 8));
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void meetingContainsOtherMeetingTest() {
	        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 8), new Meeting(2, 5));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void meetingsStaySeparateTest() {
	        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(4, 8));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList(
	            new Meeting(1, 3), new Meeting(4, 8)
	        );
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void multipleMergedMeetingsTest() {
	        final List<Meeting> meetings = Arrays.asList(
	            new Meeting(1, 4), new Meeting(2, 5), new Meeting (5, 8));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void meetingsNotSortedTest() {
	        final List<Meeting> meetings = Arrays.asList(
	            new Meeting(5, 8), new Meeting(1, 4), new Meeting(6, 8));
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList( 
	            new Meeting(1, 4), new Meeting(5, 8)
	        );
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void sampleInputTest() {
	        final List<Meeting> meetings = Arrays.asList(
	            new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
	            new Meeting(10, 12), new Meeting(9, 10) 
	        );
	        final List<Meeting> actual = mergeRanges(meetings);
	        final List<Meeting> expected = Arrays.asList( 
	            new Meeting(0, 1), new Meeting(3, 8), new Meeting(9, 12)
	        );
	        assertEquals(expected, actual);
	    }

	    public static void main(String[] args) {
	        Result result = JUnitCore.runClasses(Meeting.class);
	        for (Failure failure : result.getFailures()) {
	            System.out.println(failure.toString());
	        }
	        if (result.wasSuccessful()) {
	            System.out.println("All tests passed.");
	        }
	    }
}

