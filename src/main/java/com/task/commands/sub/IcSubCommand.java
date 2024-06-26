package com.task.commands.sub;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;
import com.task.commands.base.BaseSubCommand;
import com.task.form.CreateMenu;

/**
 * 创建任务子指令
 *
 * @author SmallasWater
 */
public class IcSubCommand extends BaseSubCommand {

    public IcSubCommand(String name) {
        super(name);
    }

    @Override
    protected boolean canUse(CommandSender sender) {
        return sender.isPlayer();
    }

    @Override
    public String[] getAliases() {
        return new String[0];
    }


    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player) {
            CreateMenu.sendCreateTaskMenu((Player) sender);
            return true;
        } else {
            sender.sendMessage("The console cannot execute this command");
        }
        return false;
    }

    @Override
    public CommandParameter[] getParameters() {
        return new CommandParameter[0];
    }
}
