package io.allen.modules.generator.dao;

import java.util.List;
import java.util.Map;

import io.allen.modules.generator.entity.BcDefaultAccountEntity;
import io.allen.modules.generator.entity.BcTransactionEntity;
import io.allen.modules.sys.dao.BaseDao;

/**
 * 默认区块链账户
 * 
 * @author allen.liu
 * @date 2017-11-14 09:36:52
 */
public interface BcDefaultAccountDao extends BaseDao<BcDefaultAccountEntity> {
	List<BcDefaultAccountEntity> queryAccountByStatusAndType(Map<String, Object> map);
}
