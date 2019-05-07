package 丁聪.Test1;
/*有一个字符串String str="itcast hemai itcastJava Jheitcast" ，
判断字符串中的每个单词是否是以“it”开头，如果是将“it”替换成“java”，
将替换前的字符串和替换后的字符串均按以下格式输出。*/
public class Test01 {
    public static void main(String[] args) {
        String str = "itcast hemai itcastJava Jheitcast";
        //分割字符串
        String[] sp = str.split(" ");
        //判断首字母是否"it"并替换
        String java="java";
        System.out.println(str);
        for (int i = 0; i < sp.length; i++) {
            if (sp[i].startsWith("it")) {
               String st=java+sp[i].substring(2);
               sp[i]=st;
            }
            System.out.print(sp[i]+" ");
        }
    }
}
