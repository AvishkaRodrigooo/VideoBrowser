package com.user;

public class Channel {
    private int channelList;
    private String chname;
    private String owname;
    private String owemail;
    private String description;
    private String channelId;
    private String password;

    public Channel(int channelList, String chname, String owname, String owemail, String description,
			String channelId, String password) {
		
		this.channelList=channelList;
		this.chname = chname;
		this.owname = owname;
		this.owemail = owemail;
		this.description = description;
		this.channelId = channelId;
		this.password = password;
	}

	public int getChannelList() {
		return channelList;
	}


	public String getChname() {
		return chname;
	}


	public String getOwname() {
		return owname;
	}



	public String getOwemail() {
		return owemail;
	}



	public String getDescription() {
		return description;
	}

	

	public String getChannelId() {
		return channelId;
	}


	public String getPassword() {
		return password;
	}

    
    
    
}