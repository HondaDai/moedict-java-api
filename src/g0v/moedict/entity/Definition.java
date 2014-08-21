package g0v.moedict.entity;

import java.util.List;

/**
 * @author HondaDai
 * @date 2014/08/21
 *
 */

public class Definition {
	private String def;
	private String type;
	private List<String> quote;
	private List<String> example;
	private List<String> link;
	/**
	 * @return the def
	 */
	public String getDef() {
		return def;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the quote
	 */
	public List<String> getQuote() {
		return quote;
	}
	/**
	 * @return the example
	 */
	public List<String> getExample() {
		return example;
	}
	/**
	 * @return the link
	 */
	public List<String> getLink() {
		return link;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Definition [def=" + def + ", type=" + type + ", quote=" + quote
				+ ", example=" + example + ", link=" + link + "]";
	}
	
	
}
