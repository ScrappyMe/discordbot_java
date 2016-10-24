import net.dv8tion.jda.events.ReadyEvent;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
		// extends listeneradapter, luistert naar commands
	
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		if (event.getMessage().getContent().startsWith("~!") && event.getMessage().getAuthor().getId() != event.getJDA().getSelfInfo().getId()) {
			
			Main.handleCommand(Main.PARSER.parse(event.getMessage().getContent().toLowerCase(), event));
			
		}
	}
	
	@Override
	public void onReady(ReadyEvent event) {
		//Main.log("status", "Logged in as: " + event.getJDA().getSelfInfo().getUsername());
	}
}
