package src;/* shorten system.out.print */

public interface Log_output {
    default void out(String msg) {
        System.out.println(msg);
    }
}
