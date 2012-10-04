package net.minecraft.src;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import ClientCommands.ChatCallback;
import ClientCommands.ClientCommandManager;
import ClientCommands.ClientCommandSender;


import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ICommandSender;

public class mod_ClientCommands extends BaseMod
{
	private static mod_ClientCommands instance = null;
	private ClientCommandManager clientCommandManager = new ClientCommandManager();
	private ClientCommandSender commandSender;
	private List<ChatCallback> chatCallbacks = new ArrayList<ChatCallback>();

	public Boolean handleClientCommand(String commandLine)
	{
		return clientCommandManager.handleClientCommand(commandLine);
	}

	public String executeChatCallbacks(String text)
	{
		StringBuilder textBuilder = new StringBuilder(text);
		for (ChatCallback callback : getChatCallbacks())
			if (callback.execute(textBuilder))
				break;

		return textBuilder.toString();
	}

	public mod_ClientCommands()
	{
    	instance = this;
	}

	public static mod_ClientCommands getInstance() throws NullPointerException
	{
		if (instance == null)
			throw new NullPointerException();

		return instance;
	}

	@Override
	public String getVersion()
	{
		return "v0.9 by slide23, totemo for Minecraft v1.3.2";
	}

	@Override
	public void load()
	{
	}

	public ClientCommandManager getClientCommandManager() { return clientCommandManager; }
	public void addChatCallback(ChatCallback callback) { chatCallbacks.add(callback); }
	public void registerCommand(ICommand par1ICommand) { clientCommandManager.registerCommand(par1ICommand); }
	public List<ChatCallback> getChatCallbacks() { return chatCallbacks; }
}