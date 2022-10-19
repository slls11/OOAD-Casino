package src.Observer;

// sends game updates to logger
public class GameObserver extends Observer {
    String log_message;
    public GameObserver(Logger logger, String str){
        this.logger = logger;
        this.logger.addObserver(this);
        this.log_message = str;
    }
    @Override
    public void update(){
        logger.log.add(log_message);
    }
}
