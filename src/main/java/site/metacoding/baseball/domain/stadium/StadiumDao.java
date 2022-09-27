package site.metacoding.baseball.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public List<Stadium> findAll();
	public Stadium findById(Integer id);
	public void insert(Stadium stadium);
	public void update();
	public void deleteByIdInte(Integer id);
}
