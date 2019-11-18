package TeamPackage;

public class Team {
	private Long teamId;
	private String teamName;
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
     public Team(Long teamId,String teamName) {
    	 this.teamId = teamId;
    	 this.teamName = teamName;
     }
}
