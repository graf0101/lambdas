package lambdas.ch03;

@FunctionalInterface
public interface NumberFilter {

    public boolean filterNumber(Integer number);

}
