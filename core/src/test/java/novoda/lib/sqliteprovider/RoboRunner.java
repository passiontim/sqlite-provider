package novoda.lib.sqliteprovider;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

public class RoboRunner extends RobolectricTestRunner {

    public RoboRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

}
