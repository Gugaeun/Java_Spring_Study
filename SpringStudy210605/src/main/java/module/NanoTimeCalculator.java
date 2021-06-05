package module;

public class NanoTimeCalculator implements Calculator{
    private Calculator delegate;
    public NanoTimeCalculator(Calculator delegate) {
        this.delegate = delegate; // delegate -> 위임하다는 뜻을 가지고 있음
    }

    @Override
    public long factorial(long num) {
        long startTime = System.nanoTime();
        long result = delegate.factorial(10000);
        long endTime = System.nanoTime();

        System.out.printf("NonoTimeCalculator.factorial("+ num +") 실행 시간 = %d\n", (endTime - startTime));
        return result;
    }
}
