//package korttiohjelmisto.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.dao.IncorrectResultSizeDataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementCreator;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import korttiohjelmisto.bean.Osoite;
//
//@Repository
//public class OsoiteDAOSpringJdbcImpl implements OsoiteDAO {
//	
//	@Inject
//	private JdbcTemplate jdbcTemplate;
//	
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//	
//	// talleta
//	public void talleta(Osoite o) {
//		final String sql = "INSERT INTO osoite(etunimi, sukunimi, lahiosoite, postinumero, postitoimipaikka) values(?,?,?,?,?)";
//		
//		final String etunimi = o.getEtunimi();
//		final String sukunimi = o.getSukunimi();
//		final String lahiosoite = o.getLahiosoite();
//		final String postinumero = o.getPostinumero();
//		final String postitoimipaikka = o.getPostitoimipaikka();
//		
//		KeyHolder idHolder = new GeneratedKeyHolder();
//		
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			public PreparedStatement createPreparedStatement(
//					Connection connection) throws SQLException {
//				PreparedStatement ps = connection.prepareStatement(sql,
//						new String[] { "id" });
//				ps.setString(1, etunimi);
//				ps.setString(2, sukunimi);
//				ps.setString(3, lahiosoite);
//				ps.setString(4, postinumero);
//				ps.setString(5, postitoimipaikka);
//				return ps;
//			}
//		}, idHolder);
//		
//		o.setId(idHolder.getKey().intValue());
//
//	}
//	
//	// muokkaa
//	public void muokkaa(Osoite o) {
//		final String sql = "UPDATE osoite "
//				+ "SET "
//				+ "etunimi=?, "
//				+ "sukunimi=?, "
//				+ "lahiosoite=?, "
//				+ "postinumero=?, "
//				+ "postitoimipaikka=? "
//				+ "WHERE id=?";
//		
//		final int id = o.getId();
//		final String etunimi = o.getEtunimi();
//		final String sukunimi = o.getSukunimi();
//		final String lahiosoite = o.getLahiosoite();
//		final String postinumero = o.getPostinumero();
//		final String postitoimipaikka = o.getPostitoimipaikka();
//		
//		
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			public PreparedStatement createPreparedStatement(
//					Connection connection) throws SQLException {
//				PreparedStatement ps = connection.prepareStatement(sql);
//				ps.setString(1, etunimi);
//				ps.setString(2, sukunimi);
//				ps.setString(3, lahiosoite);
//				ps.setString(4, postinumero);
//				ps.setString(5, postitoimipaikka);
//				ps.setInt(6, id);
//				return ps;
//			}
//		});
//		
//	}
//	
//	// poista
//	public void poista(Osoite o) {
//		final String sql = "DELETE FROM osoite WHERE id=?";
//		
//		final int id = o.getId();
//		
//		jdbcTemplate.update(new PreparedStatementCreator() {
//			public PreparedStatement createPreparedStatement(
//					Connection connection) throws SQLException {
//				PreparedStatement ps = connection.prepareStatement(sql);
//						ps.setInt(1, id);
//				return ps;
//			}
//		});	
//	}
//	
//	//hae
////	public Osoite etsi (int id) {
////		String sql = "SELECT etunimi, sukunimi, lahiosoite, postinumero, postitoimipaikka, id FROM osoite WHERE id = ?";
////		Object parametrit = new Object[] { id };
////		RowMapper<Osoite> mapper = new OsoiteRowMapper();
////
////		Osoite o;
////		try {
////			o = jdbcTemplate.queryForObject(sql, parametrit, mapper);
////		} catch (IncorrectResultSizeDataAccessException e) {
////			throw new OsoitettaEiLoydyPoikkeus(e);
////		}
////		
////		return o;
////	}
//	
//	// hae kaikki
//	public List<Osoite> haeKaikki() {
//		
//		String sql = "SELECT id, etunimi, sukunimi, lahiosoite, postinumero, postitoimipaikka FROM osoite ORDER BY sukunimi";
//		RowMapper<Osoite> mapper = new OsoiteRowMapper();
//		List<Osoite> osoitteet = jdbcTemplate.query(sql, mapper);
//		
//		return osoitteet;
//	}
//
//	
//}
