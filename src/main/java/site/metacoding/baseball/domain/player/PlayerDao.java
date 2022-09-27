package site.metacoding.baseball.domain.player;

import java.util.List;

public interface PlayerDao {
	public List<Player> findAll();
	public Player findById(Integer id);
	public void insert(Player player);
	public void update();
	public void deleteByIdInte(Integer id);
}
