package br.com.eterniaserver.eterniacrates.objects;

import br.com.eterniaserver.eterniacrates.enums.Commands;

public class CommandLocale {

    public final Commands id;
    public final String name;
    public final String syntax;
    public final String description;
    public final String perm;
    public final String aliases;

    public CommandLocale(Commands id, String name, String syntax, String description, String perm, String aliases) {
        this.id = id;
        this.name = name;
        this.syntax = syntax;
        this.description = description;
        this.perm = perm;
        this.aliases = aliases;
    }

}