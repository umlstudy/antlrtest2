import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CSVLoader extends CSVBaseListener {

    List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
    List<String> header;
    List<String> currentRow;

    @Override
    public void enterHeader(CSVParser.HeaderContext ctx) {
        super.enterHeader(ctx);
    }

    @Override
    public void exitHeader(CSVParser.HeaderContext ctx) {
        super.exitHeader(ctx);
        header = new ArrayList<String>();
        header.addAll(currentRow);
    }

    @Override
    public void enterLine(CSVParser.LineContext ctx) {
        super.enterLine(ctx);
        currentRow = new ArrayList<String>();
    }

    @Override
    public void exitLine(CSVParser.LineContext ctx) {
        super.exitLine(ctx);
        if (ctx.getParent().getRuleIndex() == CSVParser.RULE_header)
            return;
        Map<String, String> m = new LinkedHashMap<String, String>();
        int i = 0;
        for(String v:currentRow){
            m.put(header.get(i),v);
            i++;
        }
        rows.add(m);
    }

    @Override
    public void exitText(CSVParser.TextContext ctx) {
        super.exitText(ctx);
        currentRow.add(ctx.TEXT().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        super.exitEmpty(ctx);
        currentRow.add("");
    }
}
