import java.util.*;

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
	
	public static List<Meeting> mergeMeetings(List<Meeting> meetings) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Meeting> unmergedMeetings = new ArrayList<>();
		
		unmergedMeetings.add(new Meeting(0,1));
		unmergedMeetings.add(new Meeting(3,5));
		unmergedMeetings.add(new Meeting(4,8));
		unmergedMeetings.add(new Meeting(10,12));
		unmergedMeetings.add(new Meeting(9,10));
		
		for (Meeting meeting : mergeMeetings(unmergedMeetings)){
			System.out.println("Meeting(" + meeting.getStartTime() + "," + meeting.getEndTime() + ")");
		}
	}
}
