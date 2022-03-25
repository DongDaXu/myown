package com.dong.service.impl;

import com.dong.dao.ProvinceDao;
import com.dong.pojo.Province;
import com.dong.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provinceService")
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public Province querprovince(int id) {
        return provinceDao.querprovince(id);
    }
}
