import java.io.File;

public class AnalysisFile {
    private static final String timeAnalysisPath = "assets/analysisTime.out";
    private static final String memoryAnalysisPath = "assets/analysisMemory.out";

    private File inputTimeAnalysis;
    private File inputMemoryAnalysis;

    public void config(){
        try {
            this.openMemoryAnalysis(memoryAnalysisPath);
            this.openTimeAnalysis(timeAnalysisPath);
        }
        catch(ArquivoNaoEncontradoException error){
            error.printStackTrace();
        }
    }

    protected void openTimeAnalysis(String path) throws ArquivoNaoEncontradoException{
        File file = new File(path);
        if(!file.isFile() || !file.exists()){
            throw new ArquivoNaoEncontradoException();
        }
        inputTimeAnalysis = file;
    }

    public File getTimeAnalysis() {
        return inputTimeAnalysis;
    }

    protected void openMemoryAnalysis(String path) throws ArquivoNaoEncontradoException{
        File file = new File(path);
        if(!file.isFile() || !file.exists()){
            throw new ArquivoNaoEncontradoException();
        }
        inputMemoryAnalysis = file;
    }

    public File getMemoryAnalysis() {
        return inputMemoryAnalysis;
    }
}
