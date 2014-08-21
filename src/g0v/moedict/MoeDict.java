package g0v.moedict;

import g0v.moedict.entity.Word;
import retrofit.RestAdapter;

/**
 * @author HondaDai
 * @date 2014/08/21
 *
 */

public class MoeDict {
	
	public static MoeDictService newInstance() {
		
		RestAdapter restAdapter = new RestAdapter.Builder()
        	.setEndpoint(MoeDictService.API_URL)
        	.build();
		
		return restAdapter.create(MoeDictService.class);
	}
	
	
	public static void main(String[] args) {
		
		
		MoeDictService moeDict = MoeDict.newInstance();
		Word w = moeDict.findWord("萌");

		System.out.println(w.getTitle());
		System.out.println(w.getStrokeCount());
		System.out.println(w.toString());
		
	}
	
	
}
