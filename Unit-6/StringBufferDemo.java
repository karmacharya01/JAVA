public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        System.out.println("Length od stringbuffer is:" +stringBuffer.length());
        System.out.println("Bydeafult Capicity of stringbuffer is :"+stringBuffer.capacity());
        
        StringBuffer sb=new StringBuffer("Hello Java");
        System.out.println("Length of stringbuffer is:"+sb.length());
        System.out.println("Bydeafult Capicity of stringbuffer is :"+sb.capacity());

        System.out.println("Original Text:"+sb);
        sb.append("Programming");
        System.out.println(sb);

        sb.insert(4, "Programming");
        System.out.println(sb);
        sb.replace(0, 5, "Hi");
        System.out.println("Replaced Text:"+sb);
        sb.reverse();

        System.out.println("Reversed Stringbuffer content:"+sb);

    }
}
