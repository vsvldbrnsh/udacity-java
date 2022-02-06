package com.udacity.edu.game;

class Encoder {
    private String title;
    private String titleHidden;

    //getters-setters
    public String getTitle(){return title;}
    public void setTitle(String value){this.title = value;}

    public void setTitleHidden(String value){this.titleHidden = value;}
    public String getTitleHidden(){return titleHidden;}

    // user defined functions
    public void encodeTitle(String data){
        char[] dataChars = data.toCharArray();
        for(int i = 0; i<dataChars.length; i++){
            if(dataChars[i] !=' ' && dataChars[i] !='\''){
                dataChars[i]='_';
            }
        }
        String titleHidden = String.valueOf(dataChars);
        setTitleHidden(titleHidden);
    }

    public void recompileHiddenTitle(String title, String letter){
        char symbol = letter.charAt(0);
        char[] b = getTitleHidden().toCharArray();
        char[] a = title.toCharArray();
        for(int i = 0; i<a.length; i++){
            if(a[i] == symbol) {
                b[i] = symbol;
            }
        }
        String titleHidden = String.valueOf(b);
        setTitleHidden(titleHidden);
    }

    public boolean compareStings(String one, String two){
                boolean flag = true;
                char[] raw1 = one.toCharArray();
                char[] raw2 = two.toCharArray();
                if(raw1.length == raw2.length){
                    for(int i=0; i<raw1.length; i++){
                        if(raw1[i]!=raw2[i]){
                            flag=false;
                        }
                    }
                }else{
                    flag=false;
                }
                return flag;
    }

    //    public String recompileHiddenTitle(String title, String hiddenTitle, String letter){
//        char symbol = letter.charAt(0);
//        char[] b = hiddenTitle.toCharArray();
//        char[] a = title.toCharArray();
//        for(int i = 0; i<a.length; i++){
//            if(a[i] == symbol){
//                b[i] = symbol;
//            }
//        }
//        String titleHidden = String.valueOf(b);
//        return titleHidden;
//    }

}
