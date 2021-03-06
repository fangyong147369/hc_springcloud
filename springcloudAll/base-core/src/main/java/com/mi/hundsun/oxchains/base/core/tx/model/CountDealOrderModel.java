package com.mi.hundsun.oxchains.base.core.tx.model;

import com.mi.hundsun.oxchains.base.core.tx.po.DealOrder;
import com.mi.hundsun.oxchains.base.core.tx.po.MainDelegation;
import com.mi.hundsun.oxchains.base.core.tx.po.SubDelegation;
import lombok.Data;

/**
 * 成交订单model
 */
@Data
public class CountDealOrderModel extends DealOrder {

    private Long totalTransactions;

    /**
     * 买入卖出次数
     */
    private Long numbers;

}
