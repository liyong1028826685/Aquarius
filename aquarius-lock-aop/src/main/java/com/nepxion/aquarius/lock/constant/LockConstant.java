package com.nepxion.aquarius.lock.constant;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import com.nepxion.aquarius.common.property.AquariusPropertiesManager;

public class LockConstant {
    public static final String DELEGATE_NAME = AquariusPropertiesManager.getProperties().getString("lockDelegate");
}