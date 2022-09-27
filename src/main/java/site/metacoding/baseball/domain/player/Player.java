package site.metacoding.baseball.domain.player;

import java.sql.Timestamp;

public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter; // 몰랐다!
	private Timestamp createdAt;
}
