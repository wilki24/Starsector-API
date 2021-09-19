package com.fs.starfarer.api.impl.campaign.missions.cb;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.missions.hub.BaseHubMission;

public class CBStats {
	
	public static int BASE_REWARD = Global.getSettings().getInt("basePersonBounty");
	public static int REWARD_PER_DIFFICULTY = Global.getSettings().getInt("personBountyPerLevel");
	
	public static float DEFAULT_DAYS = 120;
	public static float REMNANT_STATION_DAYS = 365;
	public static float ENEMY_STATION_DAYS = 365;
	public static float REMNANT_PLUS_DAYS = 365;
	
	// offer frequency
	public static float PATHER_FREQ = 0.5f;
	public static float PIRATE_FREQ = 1f;
	public static float DESERTER_FREQ = 1f;
	public static float DERELICT_FREQ = 0.5f;
	public static float REMNANT_FREQ = 0.5f;
	public static float REMNANT_STATION_FREQ = 0.5f;
	public static float MERC_FREQ = 0.5f;
	public static float REMNANT_PLUS_FREQ = 1f;
	public static float ENEMY_STATION_FREQ = 0.5f;
	
	// bounty mult
	public static float PATHER_MULT = 0.8f;
	public static float PIRATE_MULT = 0.8f;
	public static float DESERTER_MULT = 1f;
	public static float DERELICT_MULT = 1.2f;
	public static float REMNANT_MULT = 1.75f;
	public static float REMNANT_STATION_MULT = 2f;
	public static float MERC_MULT = 2f;
	public static float REMNANT_PLUS_MULT = 3f;
	public static float ENEMY_STATION_MULT = 2f;
	
	// offer frequency
	public static float TRADER_FREQ = 1f;
	public static float PATROL_FREQ = 1f;
	
	// bounty mult
	public static float TRADER_MULT = 0.5f;
	public static float PATROL_MULT = 1f;
	
	
	
	public static int getBaseBounty(int difficulty, float mult, BaseHubMission mission) {
		int baseReward = CBStats.BASE_REWARD + difficulty * CBStats.REWARD_PER_DIFFICULTY;
		baseReward *= mult;
		if (mission != null) {
			baseReward *= 0.9f + 0.2f * mission.getGenRandom().nextFloat();
			baseReward = BaseHubMission.getRoundNumber(baseReward);
		}
		return baseReward;
	}

}


