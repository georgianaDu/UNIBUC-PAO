package clase;

public class ExceptionHasAClass {

    private ExceptionClassExample exceptionClassExample;

    public ExceptionClassExample getExceptionClassExample() {
        return exceptionClassExample;
    }

    public void setExceptionClassExample(ExceptionClassExample exceptionClassExample) {
        this.exceptionClassExample = exceptionClassExample;
    }

    @Override
    public String toString() {
        return "ExceptionHasAClass{" +
                "exceptionClassExample=" + exceptionClassExample +
                '}';
    }
}
