package g0v.moedict.entity;

import java.util.List;

/**
 * @author HondaDai
 * @date 2014/08/21
 *
 */

public class Heteronym {
	private String bopomofo;
	private String bopomofo2;
	private List<Definition> definitions;
	

	/**
	 * @return the bopomofo
	 */
	public String getBopomofo() {
		return bopomofo;
	}
	/**
	 * @return the bopomofo2
	 */
	public String getBopomofo2() {
		return bopomofo2;
	}
	/**
	 * @return the definitions
	 */
	public List<Definition> getDefinitions() {
		return definitions;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Heteronym [bopomofo=" + bopomofo + ", bopomofo2=" + bopomofo2
				+ ", definitions=" + definitions + "]";
	}
	
}
