//package korttiohjelmisto.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import korttiohjelmisto.bean.Osoite;
//
//public class OsoiteRowMapper implements RowMapper<Osoite> {
//
//	public Osoite mapRow(ResultSet rs, int rowNum) throws SQLException  {
//		Osoite o = new Osoite();
//		o.setId(rs.getInt("id"));
//		o.setEtunimi(rs.getString("etunimi"));
//		o.setSukunimi(rs.getString("sukunimi"));
//		o.setLahiosoite(rs.getString("lahiosoite"));
//		o.setPostinumero(rs.getString("postinumero"));
//		o.setPostitoimipaikka(rs.getString("postitoimipaikka"));
//		
//		return o;
//	}
//
//}
