package Command;

public class CommandAuszahlen implements AbstractCommand{
    private Konto konto;

    public CommandAuszahlen(Konto konto) {
        this.konto = konto;
    }

    public void CommandEinzahlen(Konto konto){
        this.konto = konto;
    }
    @Override
    public void execute() {

    }
}
