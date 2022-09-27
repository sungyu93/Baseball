package site.metacoding.baseball.domain.team;

import java.util.List;

public interface TeamDao {
	public List<Team> findAll();
	public Team findById(Integer id);
	public void insert(Team team);
	public void update();
	public void deleteByIdInte(Integer id);
}
