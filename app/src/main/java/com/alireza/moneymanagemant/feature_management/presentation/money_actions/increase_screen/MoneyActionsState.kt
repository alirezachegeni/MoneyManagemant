package com.alireza.moneymanagemant.feature_management.presentation.money_actions.increase_screen

import com.alireza.moneymanagemant.feature_management.domain.model.money_increase_model.MoneyManagement

data class MoneyActionsState(
     val moneyActions: List<MoneyManagement> = emptyList(),
     val changeAccountMoney: Float? = null,
     val changeUsedPrice: Int? = null,
     )