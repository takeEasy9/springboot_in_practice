package com.te.common.utils;

import com.te.common.enums.SystemEnumEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description EnumUtilT测试类
 * @createDate 2023/6/3 15:11
 * @since 1.0.0
 */
 class EnumUtilTest {

    @Test
     void isExistByEnums() {
        boolean nullValue = EnumUtil.isExist(SystemEnumEntity.ApiRes.values(), null);
        Assertions.assertThat(nullValue).isFalse();

        boolean notIn = EnumUtil.isExist(SystemEnumEntity.ApiRes.values(), "count");
        Assertions.assertThat(notIn).isFalse();

        boolean isExist = EnumUtil.isExist(SystemEnumEntity.ApiRes.values(), "msg");
        Assertions.assertThat(isExist).isTrue();

    }
}
