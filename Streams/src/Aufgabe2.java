import java.io.IOException;
import java.io.Reader;

public class Aufgabe2 extends Reader {
    private Reader in;
    private char[] tochange = {'f','u','c','k'};
    private char[] changeto = {'*','*','*','*'};

    public Aufgabe2(Reader in){
        super();
        this.in = in;
    }
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        in.read(cbuf, off, len);
        int z = 0;

        for(int i = 0; i<cbuf.length;i++){
            if ( (cbuf[i]==tochange[z]) && (z<tochange.length) ){
                if(z==3){
                    cbuf[i-3]=changeto[z-3];
                    cbuf[i-2]=changeto[z-2];
                    cbuf[i-1]=changeto[z-1];
                    cbuf[i] = changeto[z];

                    z=0;
                }
                z++;
            }
        }
        return 0;
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

}