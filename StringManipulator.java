public class StringManipulator {
    public String trimAndConcat(String a, String b){
        String answer = a.concat(b).trim().replaceAll("\\s","");
        return answer;
    }
    public Integer getIndexOrNull(String a, char b){
        if(a.indexOf(b) == -1){
            return null;
        } else {
            return a.indexOf(b);
        }
    }
    public Integer getIndexOrNull(String c, String d){
        if(c.indexOf(d) == -1){
            return null;
        } else {
            return c.indexOf(d);
        }
    }
    public String concatSubstring(String e, int one, int two, String f){
        String fusion = e.substring(one,two).concat(f);
        return fusion;
    }
}
