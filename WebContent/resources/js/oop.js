var inherit = (()=>{
	return{
		main : ()=>{
			let emp1 = new Employee();
			emp1.setSalary("100");
			emp1.setPosition("대리");
			alert("직급, 급여: "+emp1.getSalary()+','+emp1.getPosition());
			
			let cust1 = new Customer();
			cust1.setCustNo('1234');
			cust1.setGrade('실버등급');
			alert("고객번호, 등급: "+cust1.getCustNo()+','+cust1.getGrade());
		}
	};
})();

function Employee(){
	let _salary, _position;
		return{
			setSalary :(salary)=>{this._salary = salary;},
			setPosition : (position)=>{this._position = position;},
			getSalary : ()=>{return this._salary;},
			getPosition : ()=>{return this._position;}
		};
};

function Customer(){
	let _custNo, _grade;
		return {
			setCustNo : (custNo)=>{this._custNo = custNo;},
			setGrade : (grade)=>{this._grade = grade;},
			getCustNo : ()=>{return this._custNo;},
			getGrade : ()=>{return this._grade;}
		};
};

var encap = (()=>{ //var app = new  가 생략되어 있다. 
	var main =()=>{
		person.setName('도널드 트럼프');
		person.setAge('71');
		person.setGender('남');
		person.setJob('미국 대통령');
		alert('스펙: '+person.toString());
	}
	return {main : main};
})();

var person = (()=>{
	let _name, _age, _gender, _job; // let로 바꾸면 지역(함수[person] 벗어나면 값이 제거됨). var는 전역(여기서는 초기화없이 인스턴스변수 느낌).
		return {setName:(name)=>{this._name = name;},
			setAge:(age)=>{this.age = age;},
			setGender:(gender)=>{this.gender = gender;},
			setJob:(job)=>{return this.job = job;},
			getName:()=>{return this._name;},
			getAge:()=>{return this.age;},
			getGender:()=>{return this.gender;},
			getJob:()=>{return this.job;},
			toString: ()=>{return this._name +','+this.age +','+this.gender +','+this.job +',';}
		}
})();