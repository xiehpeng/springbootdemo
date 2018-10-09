package com.mytest.springbootdemo.query;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TODO: detail description
 *
 * @author xie.huanpeng
 * @version $: PageReq.java, v 0.1 2018年10月08日 16:14 xie.huanpeng Exp $
 */
@Setter
@Getter
public class PageReq implements Serializable {

  private int    pageIndex = 1;
  private int    pageSize  = 20;
  private String query;

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
