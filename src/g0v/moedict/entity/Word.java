package g0v.moedict.entity;

import java.util.List;


/**
 * @author HondaDai
 * @date 2014/08/21
 *
 */

public class Word {
	private String title;
	private String radical;
	private int stroke_count;
	private int non_radical_stroke_count;
	private List<Heteronym> heteronyms;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the radical
	 */
	public String getRadical() {
		return radical;
	}
	/**
	 * @return the stroke_count
	 */
	public int getStrokeCount() {
		return stroke_count;
	}
	/**
	 * @return the non_radical_stroke_count
	 */
	public int getNonRadicalStrokeCount() {
		return non_radical_stroke_count;
	}
	/**
	 * @return the heteronyms
	 */
	public List<Heteronym> getHeteronyms() {
		return heteronyms;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Word [title=" + title + ", radical=" + radical
				+ ", stroke_count=" + stroke_count
				+ ", non_radical_stroke_count=" + non_radical_stroke_count
				+ ", heteronyms=" + heteronyms + "]";
	}
	
}
