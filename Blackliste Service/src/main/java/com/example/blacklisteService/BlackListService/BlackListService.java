package com.example.blacklisteService.BlackListService;

import com.example.blacklisteService.repository.BlackListRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackListService {
    @Autowired
    BlackListRep blackListRep;

    public boolean getIsInBlackList(Long cin)
    {
        return blackListRep.existsByCIN(cin);
    }
}
