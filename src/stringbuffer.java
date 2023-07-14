public class stringbuffer {
    String str="neha";
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("neha");//provide 16 space extra along with str,coz every time data changes ,in heap there should be continious memory location what if there is no continious location ,memory have to reallocate,to avoid
        System.out.println(sb.capacity());//16 bytes
        // to change the string :append is used//
        sb.append("panda");
        System.out.println(sb);
        //string buffer is thread safe where string builder is not thread safe//

    }
}
