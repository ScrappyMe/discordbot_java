import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class ZuurCommand implements Command{

	private final String zuur = "USAGE: ~!zuur";
	
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("Manne is zuur");
		
	}

	@Override
	public String help() {
		return zuur;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		return;
		
	}

}
