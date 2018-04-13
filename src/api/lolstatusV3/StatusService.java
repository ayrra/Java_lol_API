package api.lolstatusV3;

import api.Helpers;
import api.Entities.ShardStatus;

public class StatusService {

	public static ShardStatus getStatus (String url) {
		ShardStatus shardStatus = new ShardStatus();
		shardStatus = (ShardStatus) Helpers.parseJsonAndReturn(url, shardStatus);
		return shardStatus;
	}
	
}
