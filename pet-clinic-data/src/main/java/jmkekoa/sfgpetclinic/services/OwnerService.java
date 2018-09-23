package jmkekoa.sfgpetclinic.services;

import jmkekoa.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
