import java.util.HashMap;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

public class Main {

	private static JDA jda;
	public static final CommandParser PARSER = new CommandParser();

	public static HashMap<String, Command> commands = new HashMap<String, Command>();

	public static void main(String[] args) {

		try {
			jda = new JDABuilder().addListener(new BotListener()).setBotToken(Zuurbot.discordToken()).buildBlocking();
			jda.setAutoReconnect(true);
		} catch (Exception e) {
			e.printStackTrace();

		commands.put("ping", new PingCommand());
		commands.put("zuur", new ZuurCommand());
		// Voor het toevoegen van de bot:
		// https://discordapp.com/oauth2/authorize?&client_id=235371564516900865&scope=bot

	}

	public static void handleCommand(CommandParser.CommandContainer cmd) {
		if (commands.containsKey(cmd.invoke)) {
			boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);

			if (safe) {
				commands.get(cmd.invoke).action(cmd.args, cmd.event);
				commands.get(cmd.invoke).executed(safe, cmd.event);
			} else {
				commands.get(cmd.invoke).executed(safe, cmd.event);
			}
		}
	}

}
