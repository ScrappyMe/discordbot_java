import net.dv8tion.jda.events.message.MessageReceivedEvent;

public class PingCommand implements Command {

	private final String help = "USAGE: ~!ping";

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return true;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("PONG");
	}

	@Override
	public String help() {
		return help;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		return;
	}

}
