#Client Commands#
With a few simple modifications to GuiChat.java, any mod can register custom client side commands as well as intercept and modify incoming chat messages.

##Client Commands##

mod_MyMod.java

	mod_ClientCommands.getInstance().registerCommand(new CommandHelloWorld());

CommandHelloWorld.java

	package ws.slide.minecraft.mod_MyMod;

	import net.minecraft.src.CommandBase;
	import net.minecraft.src.ICommandSender;

	public class CommandHelloWorld extends CommandBase
	{
		@Override
		public String getCommandName()
		{
			return "helloworld";
		}

		@Override
		public void processCommand(ICommandSender sender, String[] arguments)
		{
			sender.sendChatToPlayer("Hello World!");
		}
	}

##Chat Callbacks##
Chat callbacks allow mods to intercept and alter incoming chat messages.

mod_MyMod.java

    mod_ClientCommands.getInstance().addChatCallback(new MyChatCallback());

MyChatCallback.java

	package ws.slide.minecraft.mod_MyMod;
	
	import ws.slide.minecraft.mod_ClientCommands.ChatCallback;
	
	public class MyChatCallback implements ChatCallback
	{
		@Override
		public Boolean execute(StringBuilder line)
		{
			SimpleDateFormat timestampFormat = new SimpleDateFormat("hh:mma");
			line.insert(0, timestampFormat.format(new Date()) + " ");

			return true;
		}
	}

#Needed Modifications#

GuiChat.java

    if (!this.mc.handleClientCommand(var3))
    {
        this.mc.thePlayer.sendChatMessage(var3);
    }

Changes to

    if (!mod_ClientCommands.getInstance().handleClientCommand(var3))
    {
        this.mc.thePlayer.sendChatMessage(mod_ClientCommands.getInstance().executeChatCallbacks(var3));
    }

Add to end of file

    public GuiTextField getInputField() { return this.inputField; }