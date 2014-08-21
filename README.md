moedict-java-api
================

### Install

這是 Eclipse 專案，

  1. 請用 `git clone https://github.com/HondaDai/moedict-java-api.git` 
  2. 或直接按右邊的 `Download ZIP` 下載並解壓縮
  
接著匯入 Eclipse 並設定為 library 即可

### Usage

* [example](https://github.com/HondaDai/moedict-java-api/blob/master/src/g0v/moedict/MoeDict.java)

```
	MoeDictService moeDict = MoeDict.newInstance();
	Word w = moeDict.findWord("萌");

	System.out.println(w.getTitle());
	System.out.println(w.getStrokeCount());
	System.out.println(w.toString());

	/*
		Output:

        萌
        12
        Word [title=萌, radical=艸, stroke_count=12, non_radical_stroke_count=8, heteronyms=[Heteronym [bopomofo=ㄇㄥˊ, bopomofo2=méng, definitions=[Definition [def=草木初生的芽。, type=名, quote=[說文解字：「萌，艸芽也。」, 唐．韓愈、劉師服、侯喜、軒轅彌明．石鼎聯句：「秋瓜未落蒂，凍芋強抽萌。」], example=null, link=null], Definition [def=事物發生的開端或徵兆。, type=名, quote=[韓非子．說林上：「聖人見微以知萌，見端以知末。」, 漢．蔡邕．對詔問灾異八事：「以杜漸防萌，則其救也。」], example=null, link=null], Definition [def=人民。, type=名, quote=null, example=[如：「萌黎」、「萌隸」。], link=[通「氓」。]], Definition [def=姓。如五代時蜀有萌慮。, type=名, quote=null, example=null, link=null], Definition [def=發芽。, type=動, quote=[楚辭．王逸．九思．傷時：「明風習習兮龢暖，百草萌兮華榮。」], example=[如：「萌芽」。], link=null], Definition [def=發生。, type=動, quote=[管子．牧民：「惟有道者，能備患於未形也，故禍不萌。」, 三國演義．第一回：「若萌異心，必獲惡報。」], example=[如：「故態復萌」。], link=null]]]]]

	*/

```


