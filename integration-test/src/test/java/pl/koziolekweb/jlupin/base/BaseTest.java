package pl.koziolekweb.jlupin.base;

import com.jlupin.common.various.JLupinMainServerInZoneConfiguration;
import com.jlupin.impl.client.util.JLupinClientUtil;
import com.jlupin.interfaces.client.delegator.JLupinDelegator;
import com.jlupin.interfaces.client.delegator.exception.JLupinDelegatorException;
import com.jlupin.interfaces.common.enums.PortType;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
    private final JLupinMainServerInZoneConfiguration[] mainServerInZoneConfigurations;
    private final JLupinDelegator jLupinDelegator;

    public BaseTest() {
        mainServerInZoneConfigurations = new JLupinMainServerInZoneConfiguration[]{
                new JLupinMainServerInZoneConfiguration("NODE_1", "127.0.0.1", 9090, 9095, 9096, 9097)
        };
        jLupinDelegator = JLupinClientUtil.generateOuterMicroserviceLoadBalancerDelegator(PortType.JLRMC, mainServerInZoneConfigurations);
    }

    public JLupinDelegator getJLupinDelegator() {
        return jLupinDelegator;
    }

    @Before
    public void before() {
        try {
            jLupinDelegator.start();
        } catch (JLupinDelegatorException e) {
            throw new IllegalStateException("can not start jlupin delegator caused by:", e);
        }
    }

    @After
    public void after() {
        try {
            jLupinDelegator.stop();
        } catch (JLupinDelegatorException e) {
            throw new IllegalStateException("can not stop jlupin delegator caused by:", e);
        }
        JLupinClientUtil.closeResources();
    }
}