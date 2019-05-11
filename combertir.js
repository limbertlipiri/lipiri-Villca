(()=>{
  'use strict';
  const input = document.querySelector('input');
  const button=document.querySelector('button');
  const p=document.querySelector('p');
button.addEventListener('click',()=>{

const d=new Date(input.value);
const fecha=('LLLL');
	const resul=moment(d).format(fecha);
	
p.textContent =resul;
});
})();