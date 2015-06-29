/**
 *  evalWhenTest
 *  Author: Mathieu
 *  Description: example of the use of the eval_when operator and of the get_plans action
 */

model evalWhenTest

global{
	init{
		create agentTest number : 1;
		create agentTest2 number : 1;
	}
}

species agentTest control: simple_bdi{
	int test <- 0;
	
	plan toto when: test=10 {
		
	}
	
	plan truc1{
		
	}
	
	plan truc2{
		
	}
	
	reflex titi{
		list<BDIPlan> myplans<-get_plans() as list<BDIPlan>;
		BDIPlan planToto <- first(myplans where (each.name="toto"));
		if(eval_when(planToto)){
			write "10";
		}
		else{
			write "pas 10";
		}
		test<-test+1;
	}
	
	perceive target:agentTest2 {
		if(test=2){
			write "2";
		}
		if(myself.test=2){
			write "mon 2";
		}		
	}
	
}

species agentTest2{
	int test<-10;
	reflex bidule{
		test<-test-1;
	}
}

experiment main type: gui{
	
}

