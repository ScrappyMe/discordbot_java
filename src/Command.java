import net.dv8tion.jda.events.message.MessageReceivedEvent;

public interface Command {

	public boolean called(String[] args, MessageReceivedEvent event); // Geeft true/false terug op basis wat wordt ingevoerd
	
	public void action(String[] args, MessageReceivedEvent event);  // Geeft toegang tot channels ed.
	
	public String help();
	
	public void executed(boolean success, MessageReceivedEvent event);

}
