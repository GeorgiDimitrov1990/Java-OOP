package Word;

public abstract class CommandImpl implements CommandInterface{
    private StringBuilder sb;
    private String cut;

    protected CommandImpl(String text){
        this.sb = new StringBuilder(text);

    }

    @Override
    public void uppercase( int startIndex, int endIndex) {
        String substring = sb.substring(startIndex, endIndex);
        sb.replace(startIndex, endIndex,substring.toString().toUpperCase());
    }

    @Override
    public void cut( int startIndex, int endIndex) {
        if (startIndex == endIndex){
            this.cut = "";
        } else {
            this.cut = sb.substring(startIndex, endIndex);
            sb.delete(startIndex, endIndex);
        }
    }

    @Override
    public void paste( int startIndex, int endIndex) {
        if (startIndex == endIndex){
            sb.insert(startIndex, cut);
        } else {
            sb.replace(startIndex, endIndex, cut);
        }
    }

    public void print(){
        System.out.println(sb.toString());
    }
}
